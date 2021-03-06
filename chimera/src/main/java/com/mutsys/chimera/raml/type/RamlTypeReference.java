package com.mutsys.chimera.raml.type;

public class RamlTypeReference implements RamlReferenceType {
	
	private String referencedTypeName;
	private RamlTypeDefinition referencedType;
	
	@Override
	public String getTypeName() {
		return referencedTypeName;
	}

	@Override
	public String getReferencedTypeName() {
		return referencedTypeName;
	}

	@Override
	public void setReferencedTypeName(String referencedTypeName) {
		this.referencedTypeName = referencedTypeName;
	}

	@Override
	public RamlTypeDefinition getReferencedType() {
		return referencedType;
	}

	@Override
	public void setReferencedType(RamlTypeDefinition referencedType) {
		this.referencedType = referencedType;
	}

	@Override
	public RamlTypeFamily getTypeFamily() {
		return referencedType.getTypeFamily();
	}

	@Override
	public boolean isBuiltInType() {
		return referencedType.isBuiltInType();
	}

	@Override
	public boolean isScalar() {
		return referencedType.isScalar();
	}

	@Override
	public boolean isObject() {
		return referencedType.isObject();
	}

	@Override
	public boolean isArray() {
		return referencedType.isArray();
	}

	@Override
	public boolean isReference() {
		return true;
	}

	@Override
	public boolean isDefinition() {
		return false;
	}

}
