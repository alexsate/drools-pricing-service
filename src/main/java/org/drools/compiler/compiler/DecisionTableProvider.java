package org.drools.compiler.compiler;

import java.util.List;

import org.kie.api.io.Resource;
import org.kie.internal.builder.DecisionTableConfiguration;

public interface DecisionTableProvider {
	
	List<String> loadWorkSheetsFromResource(Resource resource,
            DecisionTableConfiguration configuration);
}
