package fixtures.url;

import fixtures.url.models.UriColor;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.time.OffsetDateTime;

public class PathsTests {
    private static AutoRestUrlTestService client;

    @BeforeClass
    public static void setup() {
        client = new AutoRestUrlTestServiceBuilder().build();
    }

    @Test
    public void getBooleanTrue() throws Exception {
        client.paths().getBooleanTrue();
    }

    @Test
    public void getBooleanFalse() throws Exception {
        client.paths().getBooleanFalse();
    }

    @Test
    public void getIntOneMillion() throws Exception {
        client.paths().getIntOneMillion();
    }

    @Test
    public void getIntNegativeOneMillion() throws Exception {
        client.paths().getIntNegativeOneMillion();
    }

    @Test
    public void getTenBillion() throws Exception {
        client.paths().getTenBillion();
    }

    @Test
    public void getNegativeTenBillion() throws Exception {
        client.paths().getNegativeTenBillion();
    }

    @Test
    public void floatScientificPositive() throws Exception {
        client.paths().floatScientificPositive();
    }

    @Test
    public void floatScientificNegative() throws Exception {
        client.paths().floatScientificNegative();
    }

    @Test
    public void doubleDecimalPositive() throws Exception {
        client.paths().doubleDecimalPositive();
    }

    @Test
    public void doubleDecimalNegative() throws Exception {
        client.paths().doubleDecimalNegative();
    }

    @Test
    public void stringUrlEncoded() throws Exception {
        client.paths().stringUrlEncoded();
    }

    @Test
    public void stringEmpty() throws Exception {
        client.paths().stringEmpty();
    }

    @Ignore("Client side validation")
    public void stringNull() throws Exception {
        try {
            client.paths().stringNull(null);
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter stringPath is required"));
        }
    }

    @Test
    public void enumValid() throws Exception {
        client.paths().enumValid(UriColor.GREEN_COLOR);
    }

    @Ignore("Client side validation")
    public void enumNull() throws Exception {
        try {
            client.paths().enumNull(null);
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter enumPath is required"));
        }
    }

    @Test
    public void byteMultiByte() throws Exception {
        client.paths().byteMultiByte("啊齄丂狛狜隣郎隣兀﨩".getBytes("UTF-8"));
    }

    @Test
    public void byteEmpty() throws Exception {
        client.paths().byteEmpty();
    }

    @Ignore("Client side validation")
    public void byteNull() throws Exception {
        try {
            client.paths().byteNull(null);
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter bytePath is required"));
        }
    }

    @Test
    public void dateValid() throws Exception {
        client.paths().dateValid();
    }

    @Ignore("Client side validation")
    public void dateNull() throws Exception {
        try {
            client.paths().dateNull(null);
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter datePath is required"));
        }
    }

    @Test
    public void dateTimeValid() throws Exception {
        client.paths().dateTimeValid();
    }

    @Ignore("Client side validation")
    public void dateTimeNull() throws Exception {
        try {
            client.paths().dateTimeNull(null);
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter dateTimePath is required"));
        }
    }

    @Test
    public void base64Url() throws Exception {
        client.paths().base64Url("lorem".getBytes());
    }

    /*
    @Test
    public void arrayCsvInPath() throws Exception {
        List<String> arrayPath = new ArrayList<>();
        arrayPath.add("ArrayPath1");
        arrayPath.add("begin!*'();:@ &=+$,/?#[]end");
        arrayPath.add(null);
        arrayPath.add("");
        client.getPathsOperations().arrayCsvInPath(arrayPath);
    }
    */

    @Test
    public void unixTimeUrl() throws Exception {
        client.paths().unixTimeUrl(OffsetDateTime.parse("2016-04-13T00:00:00Z"));
    }
}