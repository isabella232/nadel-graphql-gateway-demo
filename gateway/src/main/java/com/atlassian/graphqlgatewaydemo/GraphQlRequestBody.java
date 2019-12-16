package com.atlassian.graphqlgatewaydemo;


import java.util.Map;

public class GraphQlRequestBody {
    private String query;

    private String operationName;

    private Map<String, Object> variables;

    public String getQuery() {
        return query;
    }

    public GraphQlRequestBody setQuery(String query) {
        this.query = query;
        return this;
    }

    public String getOperationName() {
        return operationName;
    }

    public GraphQlRequestBody setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public GraphQlRequestBody setVariables(Map<String, Object> variables) {
        this.variables = variables;
        return this;
    }
}