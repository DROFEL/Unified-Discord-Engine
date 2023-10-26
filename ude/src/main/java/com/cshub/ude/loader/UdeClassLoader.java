package com.cshub.ude.loader;

public class UdeClassLoader extends ClassLoader {

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] b = loadClassData(name);
        if (b == null) throw new ClassNotFoundException();

        return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassData(String name) {
        //todo: Apache Commons IO for .jar load?

        return null;
    }
}
