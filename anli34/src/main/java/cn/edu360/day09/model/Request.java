package cn.edu360.day09.model;

import java.io.Serializable;
import java.util.Arrays;

public class Request implements Serializable{
	
	private String className;
	
	private String methodName;
	
	private Class[] paramType;
	
	private Object[] paramValue;
	
	public Request() {
		// TODO Auto-generated constructor stub
	}

	public Request(String className, String methodName, Class[] paramType, Object[] paramValue) {
		super();
		this.className = className;
		this.methodName = methodName;
		this.paramType = paramType;
		this.paramValue = paramValue;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Class[] getParamType() {
		return paramType;
	}

	public void setParamType(Class[] paramType) {
		this.paramType = paramType;
	}

	public Object[] getParamValue() {
		return paramValue;
	}

	public void setParamValue(Object[] paramValue) {
		this.paramValue = paramValue;
	}

	@Override
	public String toString() {
		return "Request [className=" + className + ", methodName=" + methodName + ", paramType="
				+ Arrays.toString(paramType) + ", paramValue=" + Arrays.toString(paramValue) + "]";
	}
	
	
}
