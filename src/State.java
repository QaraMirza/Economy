public class State {
    int population;
    GDP gdp;

    public State(int population, int gdpValue, int gdpIncreasing) {
        this.population = population;
        this.gdp = new GDP(gdpValue, gdpIncreasing);
    }

    public State(int population, int gdpValue) {
        this.population = population;
        this.gdp = new GDP(gdpValue);
    }
}