package protocal;

import java.io.Serializable;
import java.util.Arrays;

public class Request implements Serializable{
	
	private String className;
	
	private String method;
	
	private Class[] paramTypes;
	
	private Object[] paramValue;
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getMethod() {
		return method;
	}
	
	public void setMethod(String method) {
		this.method = method;
	}
	
	public Class[] getParamTypes() {
		return paramTypes;
	}
	
	public void setParamTypes(Class[] paramTypes) {
		this.paramTypes = paramTypes;
	}
	
	public Object[] getParamValue() {
		return paramValue;
	}
	
	public void setParamValue(Object[] paramValue) {
		this.paramValue = paramValue;
	}

	@Override
	public String toString() {
		return "Request [className=" + className + ", method=" + method + ", paramTypes=" + Arrays.toString(paramTypes)
				+ ", paramValue=" + Arrays.toString(paramValue) + "]";
	}
	
}
