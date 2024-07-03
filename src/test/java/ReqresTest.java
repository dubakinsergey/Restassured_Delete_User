import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ReqresTest {
    private final static String URL = "https://reqres.in/";

    @Test
    public void checkDeleteUser() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationStatusUNIQUE(204));
        given()
                .when()
                .delete("api/users/2")
                .then().log().all();
    }
}
