/*
package com.hotel.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
import org.springframework.data.cassandra.core.cql.keyspace.DropKeyspaceSpecification;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CassandraConfiguration extends AbstractCassandraConfiguration {

    private String KEYSPACE = "hotel";

    @Override
    protected String getKeyspaceName() {
        return KEYSPACE;
    }

    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
        CreateKeyspaceSpecification keyspaceSpecification = CreateKeyspaceSpecification.createKeyspace(KEYSPACE);
        return Arrays.asList(keyspaceSpecification);
    }

    protected List<DropKeyspaceSpecification> getKeyspaceDrops(){
        return Arrays.asList(DropKeyspaceSpecification.dropKeyspace(KEYSPACE));
    }

    public String[] getEntityBasePackages() {
        return new String[]{"com.hotel"};
    }

}
*/