# ReportsApi

All URIs are relative to *https://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**submitAffordAi**](ReportsApi.md#submitAffordAi) | **POST** /v4/affordai | AffordAi |


<a name="submitAffordAi"></a>
# **submitAffordAi**
> submitAffordAi().body(body).execute();

AffordAi

AffordAi

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ValidiFiBankLogin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://}";
    ValidiFiBankLogin client = new ValidiFiBankLogin(configuration);
    try {
      client
              .reports
              .submitAffordAi()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#submitAffordAi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .reports
              .submitAffordAi()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#submitAffordAi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

