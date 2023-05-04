package arvin.java.net;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class HttpURLConnectionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    public static void main(String[] args) {
        String urlPath = "http://www.baidu.com/s?wd=奥迪";
        String res = "";
        HttpURLConnection conn = null;
        try {
            URL url = new URL(urlPath);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            int code = urlConnection.getResponseCode();

            if (code == 200) {
                InputStream inputStream = urlConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                StringBuffer buffer = new StringBuffer();
                while ((line = bufferedReader.readLine()) != null) {
                    buffer.append(line);

                }
                res = buffer.toString();

            }

        } catch (Exception e) {
           // logger.error("发送get请求出错");
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.disconnect();
                conn = null;
            }
        }
        System.out.println(res);
    }

    @Test
    void getFileNameMap() {
    }

    @Test
    void setFileNameMap() {
    }

    @Test
    void setConnectTimeout() {
    }

    @Test
    void getConnectTimeout() {
    }

    @Test
    void setReadTimeout() {
    }

    @Test
    void getReadTimeout() {
    }

    @Test
    void getURL() {
    }

    @Test
    void getContentLength() {
    }

    @Test
    void getContentLengthLong() {
    }

    @Test
    void getContentType() {
    }

    @Test
    void getContentEncoding() {
    }

    @Test
    void getExpiration() {
    }

    @Test
    void getDate() {
    }

    @Test
    void getLastModified() {
    }

    @Test
    void getHeaderField() {
    }

    @Test
    void getHeaderFields() {
    }

    @Test
    void getHeaderFieldInt() {
    }

    @Test
    void getHeaderFieldLong() {
    }

    @Test
    void getHeaderFieldDate() {
    }

    @Test
    void getHeaderFieldKey() {
    }

    @Test
    void testGetHeaderField() {
    }

    @Test
    void getContent() {
    }

    @Test
    void testGetContent() {
    }

    @Test
    void getPermission() {
    }

    @Test
    void getInputStream() {
    }

    @Test
    void getOutputStream() {
    }

    @Test
    void testToString() {
    }

    @Test
    void setDoInput() {
    }

    @Test
    void getDoInput() {
    }

    @Test
    void setDoOutput() {
    }

    @Test
    void getDoOutput() {
    }

    @Test
    void setAllowUserInteraction() {
    }

    @Test
    void getAllowUserInteraction() {
    }

    @Test
    void setDefaultAllowUserInteraction() {
    }

    @Test
    void getDefaultAllowUserInteraction() {
    }

    @Test
    void setUseCaches() {
    }

    @Test
    void getUseCaches() {
    }

    @Test
    void setIfModifiedSince() {
    }

    @Test
    void getIfModifiedSince() {
    }

    @Test
    void getDefaultUseCaches() {
    }

    @Test
    void setDefaultUseCaches() {
    }

    @Test
    void setRequestProperty() {
    }

    @Test
    void addRequestProperty() {
    }

    @Test
    void getRequestProperty() {
    }

    @Test
    void getRequestProperties() {
    }

    @Test
    void setDefaultRequestProperty() {
    }

    @Test
    void getDefaultRequestProperty() {
    }

    @Test
    void setContentHandlerFactory() {
    }

    @Test
    void getContentHandler() {
    }

    @Test
    void guessContentTypeFromName() {
    }

    @Test
    void guessContentTypeFromStream() {
    }

    @Test
    void testGetHeaderFieldKey() {
    }

    @Test
    void setFixedLengthStreamingMode() {
    }

    @Test
    void testSetFixedLengthStreamingMode() {
    }

    @Test
    void setChunkedStreamingMode() {
    }

    @Test
    void testGetHeaderField1() {
    }

    @Test
    void setFollowRedirects() {
    }

    @Test
    void getFollowRedirects() {
    }

    @Test
    void setInstanceFollowRedirects() {
    }

    @Test
    void getInstanceFollowRedirects() {
    }

    @Test
    void setRequestMethod() {
    }

    @Test
    void getRequestMethod() {
    }

    @Test
    void getResponseCode() {
    }

    @Test
    void getResponseMessage() {
    }

    @Test
    void testGetHeaderFieldDate() {
    }

    @Test
    void disconnect() {
    }

    @Test
    void usingProxy() {
    }

    @Test
    void testGetPermission() {
    }

    @Test
    void getErrorStream() {
    }
}