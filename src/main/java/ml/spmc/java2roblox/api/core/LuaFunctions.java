package ml.spmc.java2roblox.api.core;

public class LuaFunctions {
    public static void print(String str) {
        System.out.println(str);
    }

    public static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
