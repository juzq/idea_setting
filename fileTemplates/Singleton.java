#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}{
    private static ${NAME} ourInstance = new ${NAME}();

    public static ${NAME} instance() {
        return ourInstance;
    }

    private ${NAME}() {
    }
}
