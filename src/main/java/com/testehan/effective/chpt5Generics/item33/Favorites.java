package com.testehan.effective.chpt5Generics.item33;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Typesafe heterogeneous container pattern
/*
    A Favorites instance is typesafe: it will never return an Integer when you
    ask it for a String. It is also heterogeneous: unlike an ordinary map, all the keys
    are of different types. Therefore, we call Favorites a typesafe heterogeneous container.
 */
public class Favorites {

    /*
        The next thing to notice is that the value type of the favorites Map is simply Object. In other words, the Map
        does not guarantee the type relationship between keys and values, which is that every value is of the type
        represented by its key
     */
    private Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorite(Class<T> type, T instance) {
        favorites.put(Objects.requireNonNull(type), instance);
    }

    /*
        First, it gets from the favorites map the value corresponding to the given Class object. This is the correct
        object reference to return, but it has the wrong compile time type: it is Object (the value type of the
        favorites map) and we need to return a T. So, the getFavorite implementation dynamically casts the object
        reference to the type represented by the Class object, using Class’s cast method.
     */
    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }

//    // Achieving runtime type safety with a dynamic cast
//    public <T> void putFavorite(Class<T> type, T instance) {
//        favorites.put(Objects.requireNonNull(type), type.cast(instance));
//    }

    public static void main(String[] args) {
        Favorites f = new Favorites();
        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class, 0xcafebabe);
        f.putFavorite(Class.class, Favorites.class);

        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);
        System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());
    }
}
