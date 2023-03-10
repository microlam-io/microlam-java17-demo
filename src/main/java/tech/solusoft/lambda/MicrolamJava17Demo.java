package tech.solusoft.lambda;

import io.microlam.aws.lambda.AbstractAPIGatewayProxyMultiMethodResourceLambda;

public class MicrolamJava17Demo extends AbstractAPIGatewayProxyMultiMethodResourceLambda {
	
	@Override
	protected void registerAllLambda() {
		registerLambda("POST /sum", new SumLambda());
		registerLambda("POST /mult", new MultLambda());
	}

}
