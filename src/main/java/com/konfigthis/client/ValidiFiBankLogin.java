package com.konfigthis.client;

import com.konfigthis.client.api.ConnectApi;
import com.konfigthis.client.api.InsightsApi;
import com.konfigthis.client.api.ReportsApi;
import com.konfigthis.client.api.TokenApi;

public class ValidiFiBankLogin {
    private ApiClient apiClient;
    public final ConnectApi connect;
    public final InsightsApi insights;
    public final ReportsApi reports;
    public final TokenApi token;

    public ValidiFiBankLogin() {
        this(null);
    }

    public ValidiFiBankLogin(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.connect = new ConnectApi(this.apiClient);
        this.insights = new InsightsApi(this.apiClient);
        this.reports = new ReportsApi(this.apiClient);
        this.token = new TokenApi(this.apiClient);
    }

}
