

package com.xworkz.objclass.internal;

public class Robo {
    public String model;
    public int version;
    public double batteryLevel;
    public boolean isActive;
    public char grade;

    public Robo(String model, int version, double batteryLevel, boolean isActive, char grade) {
        this.model = model;
        this.version = version;
        this.batteryLevel = batteryLevel;
        this.isActive = isActive;
        this.grade = grade;
    }

    public String toString() {
        return "AI{model='" + this.model + "', version=" + this.version + ", batteryLevel=" + this.batteryLevel + ", active=" + this.isActive + ", grade=" + this.grade + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Robo)) {
            return false;
        } else {
            Robo robo = (Robo)obj;
            return this.version == robo.version && this.batteryLevel == robo.batteryLevel && this.isActive == robo.isActive && this.grade == robo.grade && this.model.equals(robo.model);
        }
    }

    public int hashCode() {
        int ro = 3;
        int result = 11;
        result = 11 * result + this.model.hashCode();
        result = 11 * result + this.version;
        result = 11 * result + (int)this.batteryLevel;
        result = 11 * result + this.grade;
        result = 11 * result + (this.isActive ? 1 : 0);
        return result;
    }
}
