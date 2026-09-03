package stepDefinations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	public static Properties prop;
	public static Connection con;
	public static Statement stmt;
	public static ResultSet rs;

	@Given("Launch the Application URL")
	public void launch_the_Application_URL() {
		System.out.println("Given -- Launch the Application URL ");
		System.out.println("Duplicate Step");
	}

	@When("Click on Login button")
	public void click_on_Login_button() {
		System.out.println("When -- Click on Login button");
	}

	@Then("Verify the Login Page")
	public void verify_the_Login_Page() {
		System.out.println("Then -- Verify the Login Page");
	}

	@And("Enter valid {string} and {string}")
	public void enter_user_credentials(String user, String pass) {
		System.out.println("User Is : " + user + " And Password Is : " + pass);
	}

	@When("validate with below Data")
	public void vaidate_Data(DataTable table) {
		System.out.println("Data Table Details Are: ");
		// List<List<String>> empInfo = table.asLists(String.class);
		List<Map<String, String>> empInfo = table.asMaps(String.class, String.class);

		for (Map<String, String> emp : empInfo) {
			System.out.println("First Name 		: " + emp.get("firstName"));
			System.out.println("Last Name 		: " + emp.get("lastName"));
			System.out.println("emailID 		: " + emp.get("emailID"));
			System.out.println("Are you student : " + emp.get("student"));
			System.out.println("Location 		: " + emp.get("location"));
			System.out.println("=========================================");
		}

	}

	@When("Enter the File Path Details")
	public void fetch_Files(DataTable table) throws IOException {
		Map<String, String> filesDetails = table.asMap(String.class, String.class);

		for (Entry<String, String> e : filesDetails.entrySet()) {
			String fileName = e.getKey();
			String filepath = e.getValue();

			File file = new File(filepath);
			if (file.exists()) {
				System.out.println("============File is Reading===========");
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println("File value Is : " + line);
				}
			}
		}
	}

	@Then("Validate the Fiels and print Details")
	public void validate_The_File_Details() {
		System.out.println("Validate the Fiels and print Details");
	}

	@Given("Read the db vallues from properties {string}")
	public void read_the_db_vallues_from_properties(String filePath) throws IOException {
		System.out.println("Properties - Read the Properties file");

		prop = new Properties();
		String finalPath = System.getProperty("user.dir") + "\\" + filePath;
		System.out.println("File Path Is : " + finalPath);

		FileInputStream fis = new FileInputStream(finalPath);
		prop.load(fis);

		System.out.println("DataBase URL Is   : " + prop.getProperty("url"));
		System.out.println("DataBase Name     : " + prop.getProperty("dbName"));
		System.out.println("DataBase UserName : " + prop.getProperty("userName"));
		System.out.println("DataBase Password : " + prop.getProperty("password"));
	}

	@Given("Read the Properties file")
	public void read_the_Properties_file() {
		System.out.println("Read the Properties file");
	}

	@Then("Prepare for the JDBC login with Oracle DB")
	public void prepare_for_the_JDBC_login_with_Oracle_DB() {
		System.out.println("Prepare for the JDBC login with Oracle DB");
	}

	@Given("Make Connectino with JDBC using Oracle")
	public void make_Connectino_with_JDBC_using_Oracle() throws SQLException {
		System.out.println("Given -- Make Connectino with JDBC using Oracle");
		String url = prop.getProperty("url");
		String user = prop.getProperty("userName");
		String pass = prop.getProperty("password");

		con = DriverManager.getConnection(url, user, pass);
	}

	@When("Pass the Credentials")
	public void pass_the_Credentials() throws SQLException {
		System.out.println("Verify the Connection is Established or not");
		if (con != null)
			System.out.println("DB Connection Established...!");
		else
			System.out.println("Connection was Not established..!");
		

		String qry = "select * from dept";
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(qry);

		while (rs.next()) {
			System.out.println(rs.getInt("DEPTNO"));
			System.out.println(rs.getString("DNAME"));
		}
	}

	@Then("Verify the Connection is Established or not")
	public void verify_the_Connection_is_Established_or_not() {
		System.out.println("Verify the Connection is Established or not");
	}

	@And("read teh Dept Details and Print")
	public void read_teh_Dept_Details_Print() throws SQLException {
		System.out.println("read teh Dept Details and Print");

	}

}
