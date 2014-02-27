package com.guidewire;

import gw.lang.Gosu;
import gw.lang.GosuShop;
import gw.lang.parser.IGosuProgramParser;
import gw.lang.reflect.IConstructorInfo;
import gw.lang.reflect.IType;
import gw.lang.reflect.TypeSystem;

public class SparkGosuBootstrap
{
    public static void main( String[] args )
    {
      Gosu.init();
      IConstructorInfo init = TypeSystem.getByFullName("com.guidewire.SparkGosu")
        .getTypeInfo()
        .getCallableConstructor(TypeSystem.get(String[].class));
      init.getConstructor().newInstance(new Object[]{args});
    }
}
