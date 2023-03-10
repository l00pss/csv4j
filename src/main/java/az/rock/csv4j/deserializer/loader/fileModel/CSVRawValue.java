package az.rock.csv4j.deserializer.loader.fileModel;

public class CSVRawValue {

    private final String rawValue;

    public static CSVRawValue of(String rawValue){
        return new CSVRawValue(rawValue);
    }

    private CSVRawValue(String rawValue){
        this.rawValue = rawValue;
    }

    public String getRawValue() {
        return rawValue;
    }

    @Override
    public String toString() {
        return "CSVRawValue{" +
                "rawValue='" + rawValue + '\'' +
                '}';
    }
}
