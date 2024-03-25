# InsightsApi

All URIs are relative to *https://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInsightById**](InsightsApi.md#getInsightById) | **GET** /v4/Insights/2/{inquiryId} | Get Insights |
| [**submitLoanApplication**](InsightsApi.md#submitLoanApplication) | **POST** /v4/Insights | BankQUALIFY |


<a name="getInsightById"></a>
# **getInsightById**
> getInsightById(inquiryId).body(body).execute();

Get Insights

Get Insights

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ValidiFiBankLogin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InsightsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://}";
    ValidiFiBankLogin client = new ValidiFiBankLogin(configuration);
    String inquiryId = "inquiryId_example";
    try {
      client
              .insights
              .getInsightById(inquiryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getInsightById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .insights
              .getInsightById(inquiryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#getInsightById");
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
| **inquiryId** | **String**|  | |
| **body** | **Object**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="submitLoanApplication"></a>
# **submitLoanApplication**
> submitLoanApplication().body(body).execute();

BankQUALIFY

BankQUALIFY

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ValidiFiBankLogin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InsightsApi;
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
              .insights
              .submitLoanApplication()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#submitLoanApplication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .insights
              .submitLoanApplication()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#submitLoanApplication");
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

