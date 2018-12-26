package com.microsoft.lookup.model;

import com.microsoft.model.MetadataFileItem;
import com.microsoft.model.MethodParameter;
import com.microsoft.model.Return;
import com.microsoft.model.TypeParameter;
import java.util.List;

/**
 * Just container to keep cached precalculated values for lookup
 */
public class ExtendedMetadataFileItem extends MetadataFileItem {

    private String methodContent;
    private String fieldContent;
    private String constructorContent;
    private List<MethodParameter> parameters;
    private Return returnValue;
    private String content;
    private List<TypeParameter> typeParameters;
    private String superclass;
    private String tocName;

    public String getMethodContent() {
        return methodContent;
    }

    public void setMethodContent(String methodContent) {
        this.methodContent = methodContent;
    }

    public String getFieldContent() {
        return fieldContent;
    }

    public void setFieldContent(String fieldContent) {
        this.fieldContent = fieldContent;
    }

    public String getConstructorContent() {
        return constructorContent;
    }

    public void setConstructorContent(String constructorContent) {
        this.constructorContent = constructorContent;
    }

    public List<MethodParameter> getParameters() {
        return parameters;
    }

    @Override
    public void setParameters(List<MethodParameter> parameters) {
        this.parameters = parameters;
    }

    public Return getReturn() {
        return returnValue;
    }

    @Override
    public void setReturn(Return returnValue) {
        this.returnValue = returnValue;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    public List<TypeParameter> getTypeParameters() {
        return typeParameters;
    }

    @Override
    public void setTypeParameters(List<TypeParameter> typeParameters) {
        this.typeParameters = typeParameters;
    }

    public String getSuperclassValue() {
        return superclass;
    }

    @Override
    public void setSuperclass(String superclass) {
        this.superclass = superclass;
    }

    public void setTocName(String tocName) {
        this.tocName = tocName;
    }

    public String getTocName() {
        return tocName;
    }
}