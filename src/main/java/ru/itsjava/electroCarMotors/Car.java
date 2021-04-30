package ru.itsjava.electroCarMotors;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor

public class Car implements Comparable<Car> {
    private String firm;
    private String model;
    private int yearProduction;
    private String countryMade;
    private double power;
    private String color;

    public String getFirm() {
        return this.firm;
    }

    public String getModel() {
        return this.model;
    }

    public int getYearProduction() {
        return this.yearProduction;
    }

    public String getCountryMade() {
        return this.countryMade;
    }

    public double getPower() {
        return this.power;
    }

    public String getColor() {
        return this.color;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Car)) return false;
        final Car other = (Car) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$firm = this.getFirm();
        final Object other$firm = other.getFirm();
        if (this$firm == null ? other$firm != null : !this$firm.equals(other$firm)) return false;
        final Object this$model = this.getModel();
        final Object other$model = other.getModel();
        if (this$model == null ? other$model != null : !this$model.equals(other$model)) return false;
        if (this.getYearProduction() != other.getYearProduction()) return false;
        final Object this$countryMade = this.getCountryMade();
        final Object other$countryMade = other.getCountryMade();
        if (this$countryMade == null ? other$countryMade != null : !this$countryMade.equals(other$countryMade))
            return false;
        if (Double.compare(this.getPower(), other.getPower()) != 0) return false;
        final Object this$color = this.getColor();
        final Object other$color = other.getColor();
        if (this$color == null ? other$color != null : !this$color.equals(other$color)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Car;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $firm = this.getFirm();
        result = result * PRIME + ($firm == null ? 43 : $firm.hashCode());
        final Object $model = this.getModel();
        result = result * PRIME + ($model == null ? 43 : $model.hashCode());
        result = result * PRIME + this.getYearProduction();
        final Object $countryMade = this.getCountryMade();
        result = result * PRIME + ($countryMade == null ? 43 : $countryMade.hashCode());
        final long $power = Double.doubleToLongBits(this.getPower());
        result = result * PRIME + (int) ($power >>> 32 ^ $power);
        final Object $color = this.getColor();
        result = result * PRIME + ($color == null ? 43 : $color.hashCode());
        return result;
    }

    public String toString() {
        return "Firm: " + this.getFirm() + "\nModel: " + this.getModel() + "\nYear: " + this.getYearProduction()
                + "\nCountry: " + this.getCountryMade() + "\nPower: " + this.getPower() + " h/p" + "\nColor: "
                + this.getColor() + "\n___________";
    }



    @Override
    public int compareTo(Car car) {
        return (int) (this.power - car.power);
    }

}
