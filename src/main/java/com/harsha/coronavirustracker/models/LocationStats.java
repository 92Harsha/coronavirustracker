package com.harsha.coronavirustracker.models;

public class LocationStats {

     private String state;
     private String country;
     private int latestTotalCases;
     private int diffFromPrevDay;
     private int totalDeathCases;
     private int totalRecoveredCase;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }

    public int getTotalDeathCases() {
        return totalDeathCases;
    }

    public void setTotalDeathCases(int totalDeathCases) {
        this.totalDeathCases = totalDeathCases;
    }

    public int getTotalRecoveredCase() {
        return totalRecoveredCase;
    }

    public void setTotalRecoveredCase(int totalRecoveredCase) {
        this.totalRecoveredCase = totalRecoveredCase;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                ", diffFromPrevDay=" + diffFromPrevDay +
                ", totalDeathCases=" + totalDeathCases +
                ", totalRecoveredCase=" + totalRecoveredCase +
                '}';
    }
}
