import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class Waits {

    private WebDriver driver;

    @BeforeSuite
    protected final void setupSuite(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    protected final void setupMethod(){
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
    }

    @AfterMethod
    protected final void afterMethod(){
        if(this.driver != null) {
            this.driver.close();
        }
    }

    @DataProvider(name = "inputs")
    public Object[][] inputs(){
        return new Object[][]{
            {"BlaBlaBlo@abv.bg",
                "111111A",
                "BlaBlaBlo"}
        };
    }

    @Test(invocationCount = 3, dataProvider = "inputs")
    public void testLogin(String email, String password, String username){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

        // Open iskillo page
        driver.get("http://training.skillo-bg.com:4300/posts/all");

        //Click on Login link
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        loginLink.click();

        //Enter valid email address
        WebElement userNameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("defaultLoginFormUsername")));
        userNameField.sendKeys(email);

        //Enter valid password
        WebElement passwordField = driver.findElement(By.id("defaultLoginFormPassword"));
        passwordField.sendKeys(password);

        //Click on Remember me button
        WebElement rememberMeCheckbox = driver.findElement(By.xpath("//*[@formcontrolname=\"rememberMe\"]"));
        rememberMeCheckbox.click();

        //Click on Sign in button
        WebElement signInButton = driver.findElement(By.id("sign-in-button"));
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();

        //Click on a user to redirect to their profile page
        WebElement userButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href=\"/users/38\"]")));
        userButton.click();

        //Verify that we are on the user's page
       wait.until(ExpectedConditions.urlContains("http://training.skillo-bg.com:4300/users"));

        //Follow the user
        WebElement followButton = driver.findElement(By.xpath("//*[@class =\"btn btn-primary profile-edit-btn ng-star-inserted\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(followButton));
        followButton.click();

        //Redirect to all posts
        WebElement allPostsButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"btn-all btn btn-primary\"]")));
        wait.until(ExpectedConditions.elementToBeClickable(allPostsButton));
        allPostsButton.click();

        //Open a post
        WebElement post = driver.findElement(By.xpath("//img[@src=\"https://i.imgur.com/y5CdE46.jpg\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(post));
        post.click();

        //Verify that we are on the post page
        WebElement postDate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"post-date\"]")));

        //Like the post
        WebElement likeIcon = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"like far fa-heart fa-2x ng-star-inserted\"]")));
        wait.until(ExpectedConditions.elementToBeClickable(likeIcon));
        likeIcon.click();

        //Dislike the post
        WebElement dislikeIcon = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"like far fa-heart fa-2x ng-star-inserted liked\"]")));
        wait.until(ExpectedConditions.elementToBeClickable(dislikeIcon));
        dislikeIcon.click();

        //Comment hello on the post
        WebElement commentSection = driver.findElement(By.xpath("//*[@formcontrolname=\"content\"]"));
        wait.until(ExpectedConditions.visibilityOf(commentSection));
        commentSection.sendKeys("hello");

        //Unfollow the user
        WebElement unfollowButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"btn btn-primary ng-star-inserted\"]")));
        wait.until(ExpectedConditions.elementToBeClickable(unfollowButton));
        unfollowButton.click();

    }
}