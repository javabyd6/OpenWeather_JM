package pl.sda.weather.model;

import java.util.StringJoiner;

/**
 * @author Juliusz Mueller
 */
public class Current {

    private long last_updated_epoch;
    private String last_updated;
    private long temp_c;
    private double temp_f;
    private long is_day;
    private Condition condition;
    private double wind_mph;
    private double wind_kph;
    private long wind_degree;
    private String wind_dir;
    private long pressure_mb;
    private double pressure_in;
    private double precip_mm;
    private double precip_in;
    private long humidity;
    private long cloud;
    private double feelslike_c;
    private double feelslike_f;
    private long vis_km;
    private long vis_miles;
    private long uv;

    public Current() {
    }

    public Current(long last_updated_epoch, String last_updated, long temp_c, double temp_f, long is_day, Condition condition, double wind_mph, double wind_kph, long wind_degree, String wind_dir, long pressure_mb, double pressure_in, double precip_mm, double precip_in, long humidity, long cloud, double feelslike_c, double feelslike_f, long vis_km, long vis_miles, long uv) {
        this.last_updated_epoch = last_updated_epoch;
        this.last_updated = last_updated;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
        this.is_day = is_day;
        this.condition = condition;
        this.wind_mph = wind_mph;
        this.wind_kph = wind_kph;
        this.wind_degree = wind_degree;
        this.wind_dir = wind_dir;
        this.pressure_mb = pressure_mb;
        this.pressure_in = pressure_in;
        this.precip_mm = precip_mm;
        this.precip_in = precip_in;
        this.humidity = humidity;
        this.cloud = cloud;
        this.feelslike_c = feelslike_c;
        this.feelslike_f = feelslike_f;
        this.vis_km = vis_km;
        this.vis_miles = vis_miles;
        this.uv = uv;
    }

    public long getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public void setLast_updated_epoch(long last_updated_epoch) {
        this.last_updated_epoch = last_updated_epoch;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public long getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(long temp_c) {
        this.temp_c = temp_c;
    }

    public double getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(double temp_f) {
        this.temp_f = temp_f;
    }

    public long getIs_day() {
        return is_day;
    }

    public void setIs_day(long is_day) {
        this.is_day = is_day;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public double getWind_mph() {
        return wind_mph;
    }

    public void setWind_mph(double wind_mph) {
        this.wind_mph = wind_mph;
    }

    public double getWind_kph() {
        return wind_kph;
    }

    public void setWind_kph(double wind_kph) {
        this.wind_kph = wind_kph;
    }

    public long getWind_degree() {
        return wind_degree;
    }

    public void setWind_degree(long wind_degree) {
        this.wind_degree = wind_degree;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public long getPressure_mb() {
        return pressure_mb;
    }

    public void setPressure_mb(long pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public double getPressure_in() {
        return pressure_in;
    }

    public void setPressure_in(double pressure_in) {
        this.pressure_in = pressure_in;
    }

    public double getPrecip_mm() {
        return precip_mm;
    }

    public void setPrecip_mm(double precip_mm) {
        this.precip_mm = precip_mm;
    }

    public double getPrecip_in() {
        return precip_in;
    }

    public void setPrecip_in(double precip_in) {
        this.precip_in = precip_in;
    }

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public long getCloud() {
        return cloud;
    }

    public void setCloud(long cloud) {
        this.cloud = cloud;
    }

    public double getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(double feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public double getFeelslike_f() {
        return feelslike_f;
    }

    public void setFeelslike_f(double feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public long getVis_km() {
        return vis_km;
    }

    public void setVis_km(long vis_km) {
        this.vis_km = vis_km;
    }

    public long getVis_miles() {
        return vis_miles;
    }

    public void setVis_miles(long vis_miles) {
        this.vis_miles = vis_miles;
    }

    public long getUv() {
        return uv;
    }

    public void setUv(long uv) {
        this.uv = uv;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Current.class.getSimpleName() + "[", "]").add("last_updated_epoch=" + last_updated_epoch).add("last_updated='" + last_updated + "'").add("temp_c=" + temp_c).add("temp_f=" + temp_f).add("is_day=" + is_day).add("condition=" + condition).add("wind_mph=" + wind_mph).add("wind_kph=" + wind_kph).add("wind_degree=" + wind_degree).add("wind_dir='" + wind_dir + "'").add("pressure_mb=" + pressure_mb).add("pressure_in=" + pressure_in).add("precip_mm=" + precip_mm).add("precip_in=" + precip_in).add("humidity=" + humidity).add("cloud=" + cloud).add("feelslike_c=" + feelslike_c).add("feelslike_f=" + feelslike_f).add("vis_km=" + vis_km).add("vis_miles=" + vis_miles).add("uv=" + uv).toString();
    }
}
