# TokenApi

All URIs are relative to *https://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkHealth**](TokenApi.md#checkHealth) | **GET** /v4/HealthCheck | Health Check |
| [**create**](TokenApi.md#create) | **POST** /v4/token | OAuth 2.0 Token |


<a name="checkHealth"></a>
# **checkHealth**
> checkHealth().body(body).execute();

Health Check

Health Check

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ValidiFiBankLogin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenApi;
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
              .token
              .checkHealth()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#checkHealth");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .token
              .checkHealth()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#checkHealth");
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

 - **Content-Type**: text/plain
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="create"></a>
# **create**
> create().tokenCreateRequest(tokenCreateRequest).execute();

OAuth 2.0 Token

OAuth 2.0 Token

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ValidiFiBankLogin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://}";
    ValidiFiBankLogin client = new ValidiFiBankLogin(configuration);
    String clientId = "clientId_example";
    String clientSecret = "clientSecret_example";
    try {
      client
              .token
              .create()
              .clientId(clientId)
              .clientSecret(clientSecret)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .token
              .create()
              .clientId(clientId)
              .clientSecret(clientSecret)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#create");
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
| **tokenCreateRequest** | [**TokenCreateRequest**](TokenCreateRequest.md)|  | [optional] |

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

