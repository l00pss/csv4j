package az.rock.csv4j.deserializer.loader.fileModel;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class CSVRawLine {
    private final String rawLine;
    private final Map<Integer, CSVRawValue> csvRawLineMap = new HashMap<>();

    public static CSVRawLine of(String rawLine){
        CSVRawLine csvRawLine = new CSVRawLine(rawLine);
        csvRawLine.prepareRawLine();
        return csvRawLine;
    }


    private CSVRawLine(String rawLine){
        this.rawLine = rawLine;
    }

    private void prepareRawLine(){
        this.csvRawLineMap.clear();
        String[] rawValues = this.rawLine.split(",");
        IntStream.range(0,rawValues.length).forEach(i->this.csvRawLineMap.put(i,CSVRawValue.of(rawValues[i])));
    }

    @Override
    public String toString() {
        return "CSVRawLine{" +
                "rawLine='" + rawLine + '\'' +
                ", csvRawLineMap=" + csvRawLineMap +
                '}';
    }

    public Map<Integer, CSVRawValue> getCsvRawLineMap() {
        return csvRawLineMap;
    }

    public String getRawValue(Integer index){
        return this.csvRawLineMap.get(index).getRawValue();
    }
}
