//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.xworkz.objclass.internal;

public class Animal {
    public String species;
    public int age;
    public double weight;
    public boolean isEating;
    public char gender;

    public Animal(String species, int age, double weight, boolean isEating, char gender) {
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.isEating = isEating;
        this.gender = gender;
    }

    public String toString() {
        return "Animal{species=" + this.species + ", age=" + this.age + ", weight=" + this.weight + ", isEating=" + this.isEating + ", gender=" + this.gender + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Animal)) {
            return false;
        } else {
            Animal animal = (Animal)obj;
            return this.age == animal.age && this.weight == animal.weight && this.isEating == animal.isEating && this.gender == animal.gender && this.species.equals(animal.species);
        }
    }

    public int hashCode() {
        int ani = 1;
        int result = 4;
        result = 1 * result + this.species.hashCode();
        result = 1 * result + this.age;
        result = 1 * result + (int)this.weight;
        result = 1 * result + this.gender;
        result = 1 * result + (this.isEating ? 1 : 0);
        return result;
    }
}
