// ORM class for table 'dataperyear'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 15 23:40:23 CDT 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Station extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("Date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Date = (java.sql.Date)value;
      }
    });
    setters.put("USAF_Station", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.USAF_Station = (Integer)value;
      }
    });
    setters.put("WBAN_Id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.WBAN_Id = (Integer)value;
      }
    });
    setters.put("Time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Time = (Integer)value;
      }
    });
    setters.put("Year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Year = (Integer)value;
      }
    });
    setters.put("Latitude", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Latitude = (Integer)value;
      }
    });
    setters.put("Longitude", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Longitude = (Integer)value;
      }
    });
    setters.put("Elevation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Elevation = (Integer)value;
      }
    });
    setters.put("Wind_Direction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Wind_Direction = (Integer)value;
      }
    });
    setters.put("Quality_1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Quality_1 = (Integer)value;
      }
    });
    setters.put("Sky_Height", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Sky_Height = (Integer)value;
      }
    });
    setters.put("Quality_2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Quality_2 = (Integer)value;
      }
    });
    setters.put("Visiblity_Distance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Visiblity_Distance = (Integer)value;
      }
    });
    setters.put("Quality_3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Quality_3 = (Integer)value;
      }
    });
    setters.put("Air_Temperature", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Air_Temperature = (Integer)value;
      }
    });
    setters.put("Air_Quality", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Air_Quality = (Integer)value;
      }
    });
    setters.put("Dew_Temperature", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Dew_Temperature = (Integer)value;
      }
    });
    setters.put("Dew_Quality", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Dew_Quality = (Integer)value;
      }
    });
    setters.put("Atmospheric_Pressure", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Atmospheric_Pressure = (Integer)value;
      }
    });
    setters.put("Pressure_Quality", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        Station.this.Pressure_Quality = (Integer)value;
      }
    });
  }
  public Station() {
    init0();
  }
  private java.sql.Date Date;
  public java.sql.Date get_Date() {
    return Date;
  }
  public void set_Date(java.sql.Date Date) {
    this.Date = Date;
  }
  public Station with_Date(java.sql.Date Date) {
    this.Date = Date;
    return this;
  }
  private Integer USAF_Station;
  public Integer get_USAF_Station() {
    return USAF_Station;
  }
  public void set_USAF_Station(Integer USAF_Station) {
    this.USAF_Station = USAF_Station;
  }
  public Station with_USAF_Station(Integer USAF_Station) {
    this.USAF_Station = USAF_Station;
    return this;
  }
  private Integer WBAN_Id;
  public Integer get_WBAN_Id() {
    return WBAN_Id;
  }
  public void set_WBAN_Id(Integer WBAN_Id) {
    this.WBAN_Id = WBAN_Id;
  }
  public Station with_WBAN_Id(Integer WBAN_Id) {
    this.WBAN_Id = WBAN_Id;
    return this;
  }
  private Integer Time;
  public Integer get_Time() {
    return Time;
  }
  public void set_Time(Integer Time) {
    this.Time = Time;
  }
  public Station with_Time(Integer Time) {
    this.Time = Time;
    return this;
  }
  private Integer Year;
  public Integer get_Year() {
    return Year;
  }
  public void set_Year(Integer Year) {
    this.Year = Year;
  }
  public Station with_Year(Integer Year) {
    this.Year = Year;
    return this;
  }
  private Integer Latitude;
  public Integer get_Latitude() {
    return Latitude;
  }
  public void set_Latitude(Integer Latitude) {
    this.Latitude = Latitude;
  }
  public Station with_Latitude(Integer Latitude) {
    this.Latitude = Latitude;
    return this;
  }
  private Integer Longitude;
  public Integer get_Longitude() {
    return Longitude;
  }
  public void set_Longitude(Integer Longitude) {
    this.Longitude = Longitude;
  }
  public Station with_Longitude(Integer Longitude) {
    this.Longitude = Longitude;
    return this;
  }
  private Integer Elevation;
  public Integer get_Elevation() {
    return Elevation;
  }
  public void set_Elevation(Integer Elevation) {
    this.Elevation = Elevation;
  }
  public Station with_Elevation(Integer Elevation) {
    this.Elevation = Elevation;
    return this;
  }
  private Integer Wind_Direction;
  public Integer get_Wind_Direction() {
    return Wind_Direction;
  }
  public void set_Wind_Direction(Integer Wind_Direction) {
    this.Wind_Direction = Wind_Direction;
  }
  public Station with_Wind_Direction(Integer Wind_Direction) {
    this.Wind_Direction = Wind_Direction;
    return this;
  }
  private Integer Quality_1;
  public Integer get_Quality_1() {
    return Quality_1;
  }
  public void set_Quality_1(Integer Quality_1) {
    this.Quality_1 = Quality_1;
  }
  public Station with_Quality_1(Integer Quality_1) {
    this.Quality_1 = Quality_1;
    return this;
  }
  private Integer Sky_Height;
  public Integer get_Sky_Height() {
    return Sky_Height;
  }
  public void set_Sky_Height(Integer Sky_Height) {
    this.Sky_Height = Sky_Height;
  }
  public Station with_Sky_Height(Integer Sky_Height) {
    this.Sky_Height = Sky_Height;
    return this;
  }
  private Integer Quality_2;
  public Integer get_Quality_2() {
    return Quality_2;
  }
  public void set_Quality_2(Integer Quality_2) {
    this.Quality_2 = Quality_2;
  }
  public Station with_Quality_2(Integer Quality_2) {
    this.Quality_2 = Quality_2;
    return this;
  }
  private Integer Visiblity_Distance;
  public Integer get_Visiblity_Distance() {
    return Visiblity_Distance;
  }
  public void set_Visiblity_Distance(Integer Visiblity_Distance) {
    this.Visiblity_Distance = Visiblity_Distance;
  }
  public Station with_Visiblity_Distance(Integer Visiblity_Distance) {
    this.Visiblity_Distance = Visiblity_Distance;
    return this;
  }
  private Integer Quality_3;
  public Integer get_Quality_3() {
    return Quality_3;
  }
  public void set_Quality_3(Integer Quality_3) {
    this.Quality_3 = Quality_3;
  }
  public Station with_Quality_3(Integer Quality_3) {
    this.Quality_3 = Quality_3;
    return this;
  }
  private Integer Air_Temperature;
  public Integer get_Air_Temperature() {
    return Air_Temperature;
  }
  public void set_Air_Temperature(Integer Air_Temperature) {
    this.Air_Temperature = Air_Temperature;
  }
  public Station with_Air_Temperature(Integer Air_Temperature) {
    this.Air_Temperature = Air_Temperature;
    return this;
  }
  private Integer Air_Quality;
  public Integer get_Air_Quality() {
    return Air_Quality;
  }
  public void set_Air_Quality(Integer Air_Quality) {
    this.Air_Quality = Air_Quality;
  }
  public Station with_Air_Quality(Integer Air_Quality) {
    this.Air_Quality = Air_Quality;
    return this;
  }
  private Integer Dew_Temperature;
  public Integer get_Dew_Temperature() {
    return Dew_Temperature;
  }
  public void set_Dew_Temperature(Integer Dew_Temperature) {
    this.Dew_Temperature = Dew_Temperature;
  }
  public Station with_Dew_Temperature(Integer Dew_Temperature) {
    this.Dew_Temperature = Dew_Temperature;
    return this;
  }
  private Integer Dew_Quality;
  public Integer get_Dew_Quality() {
    return Dew_Quality;
  }
  public void set_Dew_Quality(Integer Dew_Quality) {
    this.Dew_Quality = Dew_Quality;
  }
  public Station with_Dew_Quality(Integer Dew_Quality) {
    this.Dew_Quality = Dew_Quality;
    return this;
  }
  private Integer Atmospheric_Pressure;
  public Integer get_Atmospheric_Pressure() {
    return Atmospheric_Pressure;
  }
  public void set_Atmospheric_Pressure(Integer Atmospheric_Pressure) {
    this.Atmospheric_Pressure = Atmospheric_Pressure;
  }
  public Station with_Atmospheric_Pressure(Integer Atmospheric_Pressure) {
    this.Atmospheric_Pressure = Atmospheric_Pressure;
    return this;
  }
  private Integer Pressure_Quality;
  public Integer get_Pressure_Quality() {
    return Pressure_Quality;
  }
  public void set_Pressure_Quality(Integer Pressure_Quality) {
    this.Pressure_Quality = Pressure_Quality;
  }
  public Station with_Pressure_Quality(Integer Pressure_Quality) {
    this.Pressure_Quality = Pressure_Quality;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Station)) {
      return false;
    }
    Station that = (Station) o;
    boolean equal = true;
    equal = equal && (this.Date == null ? that.Date == null : this.Date.equals(that.Date));
    equal = equal && (this.USAF_Station == null ? that.USAF_Station == null : this.USAF_Station.equals(that.USAF_Station));
    equal = equal && (this.WBAN_Id == null ? that.WBAN_Id == null : this.WBAN_Id.equals(that.WBAN_Id));
    equal = equal && (this.Time == null ? that.Time == null : this.Time.equals(that.Time));
    equal = equal && (this.Year == null ? that.Year == null : this.Year.equals(that.Year));
    equal = equal && (this.Latitude == null ? that.Latitude == null : this.Latitude.equals(that.Latitude));
    equal = equal && (this.Longitude == null ? that.Longitude == null : this.Longitude.equals(that.Longitude));
    equal = equal && (this.Elevation == null ? that.Elevation == null : this.Elevation.equals(that.Elevation));
    equal = equal && (this.Wind_Direction == null ? that.Wind_Direction == null : this.Wind_Direction.equals(that.Wind_Direction));
    equal = equal && (this.Quality_1 == null ? that.Quality_1 == null : this.Quality_1.equals(that.Quality_1));
    equal = equal && (this.Sky_Height == null ? that.Sky_Height == null : this.Sky_Height.equals(that.Sky_Height));
    equal = equal && (this.Quality_2 == null ? that.Quality_2 == null : this.Quality_2.equals(that.Quality_2));
    equal = equal && (this.Visiblity_Distance == null ? that.Visiblity_Distance == null : this.Visiblity_Distance.equals(that.Visiblity_Distance));
    equal = equal && (this.Quality_3 == null ? that.Quality_3 == null : this.Quality_3.equals(that.Quality_3));
    equal = equal && (this.Air_Temperature == null ? that.Air_Temperature == null : this.Air_Temperature.equals(that.Air_Temperature));
    equal = equal && (this.Air_Quality == null ? that.Air_Quality == null : this.Air_Quality.equals(that.Air_Quality));
    equal = equal && (this.Dew_Temperature == null ? that.Dew_Temperature == null : this.Dew_Temperature.equals(that.Dew_Temperature));
    equal = equal && (this.Dew_Quality == null ? that.Dew_Quality == null : this.Dew_Quality.equals(that.Dew_Quality));
    equal = equal && (this.Atmospheric_Pressure == null ? that.Atmospheric_Pressure == null : this.Atmospheric_Pressure.equals(that.Atmospheric_Pressure));
    equal = equal && (this.Pressure_Quality == null ? that.Pressure_Quality == null : this.Pressure_Quality.equals(that.Pressure_Quality));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Station)) {
      return false;
    }
    Station that = (Station) o;
    boolean equal = true;
    equal = equal && (this.Date == null ? that.Date == null : this.Date.equals(that.Date));
    equal = equal && (this.USAF_Station == null ? that.USAF_Station == null : this.USAF_Station.equals(that.USAF_Station));
    equal = equal && (this.WBAN_Id == null ? that.WBAN_Id == null : this.WBAN_Id.equals(that.WBAN_Id));
    equal = equal && (this.Time == null ? that.Time == null : this.Time.equals(that.Time));
    equal = equal && (this.Year == null ? that.Year == null : this.Year.equals(that.Year));
    equal = equal && (this.Latitude == null ? that.Latitude == null : this.Latitude.equals(that.Latitude));
    equal = equal && (this.Longitude == null ? that.Longitude == null : this.Longitude.equals(that.Longitude));
    equal = equal && (this.Elevation == null ? that.Elevation == null : this.Elevation.equals(that.Elevation));
    equal = equal && (this.Wind_Direction == null ? that.Wind_Direction == null : this.Wind_Direction.equals(that.Wind_Direction));
    equal = equal && (this.Quality_1 == null ? that.Quality_1 == null : this.Quality_1.equals(that.Quality_1));
    equal = equal && (this.Sky_Height == null ? that.Sky_Height == null : this.Sky_Height.equals(that.Sky_Height));
    equal = equal && (this.Quality_2 == null ? that.Quality_2 == null : this.Quality_2.equals(that.Quality_2));
    equal = equal && (this.Visiblity_Distance == null ? that.Visiblity_Distance == null : this.Visiblity_Distance.equals(that.Visiblity_Distance));
    equal = equal && (this.Quality_3 == null ? that.Quality_3 == null : this.Quality_3.equals(that.Quality_3));
    equal = equal && (this.Air_Temperature == null ? that.Air_Temperature == null : this.Air_Temperature.equals(that.Air_Temperature));
    equal = equal && (this.Air_Quality == null ? that.Air_Quality == null : this.Air_Quality.equals(that.Air_Quality));
    equal = equal && (this.Dew_Temperature == null ? that.Dew_Temperature == null : this.Dew_Temperature.equals(that.Dew_Temperature));
    equal = equal && (this.Dew_Quality == null ? that.Dew_Quality == null : this.Dew_Quality.equals(that.Dew_Quality));
    equal = equal && (this.Atmospheric_Pressure == null ? that.Atmospheric_Pressure == null : this.Atmospheric_Pressure.equals(that.Atmospheric_Pressure));
    equal = equal && (this.Pressure_Quality == null ? that.Pressure_Quality == null : this.Pressure_Quality.equals(that.Pressure_Quality));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.Date = JdbcWritableBridge.readDate(1, __dbResults);
    this.USAF_Station = JdbcWritableBridge.readInteger(2, __dbResults);
    this.WBAN_Id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.Time = JdbcWritableBridge.readInteger(4, __dbResults);
    this.Year = JdbcWritableBridge.readInteger(5, __dbResults);
    this.Latitude = JdbcWritableBridge.readInteger(6, __dbResults);
    this.Longitude = JdbcWritableBridge.readInteger(7, __dbResults);
    this.Elevation = JdbcWritableBridge.readInteger(8, __dbResults);
    this.Wind_Direction = JdbcWritableBridge.readInteger(9, __dbResults);
    this.Quality_1 = JdbcWritableBridge.readInteger(10, __dbResults);
    this.Sky_Height = JdbcWritableBridge.readInteger(11, __dbResults);
    this.Quality_2 = JdbcWritableBridge.readInteger(12, __dbResults);
    this.Visiblity_Distance = JdbcWritableBridge.readInteger(13, __dbResults);
    this.Quality_3 = JdbcWritableBridge.readInteger(14, __dbResults);
    this.Air_Temperature = JdbcWritableBridge.readInteger(15, __dbResults);
    this.Air_Quality = JdbcWritableBridge.readInteger(16, __dbResults);
    this.Dew_Temperature = JdbcWritableBridge.readInteger(17, __dbResults);
    this.Dew_Quality = JdbcWritableBridge.readInteger(18, __dbResults);
    this.Atmospheric_Pressure = JdbcWritableBridge.readInteger(19, __dbResults);
    this.Pressure_Quality = JdbcWritableBridge.readInteger(20, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.Date = JdbcWritableBridge.readDate(1, __dbResults);
    this.USAF_Station = JdbcWritableBridge.readInteger(2, __dbResults);
    this.WBAN_Id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.Time = JdbcWritableBridge.readInteger(4, __dbResults);
    this.Year = JdbcWritableBridge.readInteger(5, __dbResults);
    this.Latitude = JdbcWritableBridge.readInteger(6, __dbResults);
    this.Longitude = JdbcWritableBridge.readInteger(7, __dbResults);
    this.Elevation = JdbcWritableBridge.readInteger(8, __dbResults);
    this.Wind_Direction = JdbcWritableBridge.readInteger(9, __dbResults);
    this.Quality_1 = JdbcWritableBridge.readInteger(10, __dbResults);
    this.Sky_Height = JdbcWritableBridge.readInteger(11, __dbResults);
    this.Quality_2 = JdbcWritableBridge.readInteger(12, __dbResults);
    this.Visiblity_Distance = JdbcWritableBridge.readInteger(13, __dbResults);
    this.Quality_3 = JdbcWritableBridge.readInteger(14, __dbResults);
    this.Air_Temperature = JdbcWritableBridge.readInteger(15, __dbResults);
    this.Air_Quality = JdbcWritableBridge.readInteger(16, __dbResults);
    this.Dew_Temperature = JdbcWritableBridge.readInteger(17, __dbResults);
    this.Dew_Quality = JdbcWritableBridge.readInteger(18, __dbResults);
    this.Atmospheric_Pressure = JdbcWritableBridge.readInteger(19, __dbResults);
    this.Pressure_Quality = JdbcWritableBridge.readInteger(20, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Date, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(USAF_Station, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(WBAN_Id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Time, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Year, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Latitude, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Longitude, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Elevation, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Wind_Direction, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Quality_1, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Sky_Height, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Quality_2, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Visiblity_Distance, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Quality_3, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Air_Temperature, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Air_Quality, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Dew_Temperature, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Dew_Quality, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Atmospheric_Pressure, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Pressure_Quality, 20 + __off, 4, __dbStmt);
    return 20;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(Date, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(USAF_Station, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(WBAN_Id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Time, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Year, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Latitude, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Longitude, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Elevation, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Wind_Direction, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Quality_1, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Sky_Height, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Quality_2, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Visiblity_Distance, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Quality_3, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Air_Temperature, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Air_Quality, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Dew_Temperature, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Dew_Quality, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Atmospheric_Pressure, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Pressure_Quality, 20 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.Date = null;
    } else {
    this.Date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.USAF_Station = null;
    } else {
    this.USAF_Station = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.WBAN_Id = null;
    } else {
    this.WBAN_Id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Time = null;
    } else {
    this.Time = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Year = null;
    } else {
    this.Year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Latitude = null;
    } else {
    this.Latitude = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Longitude = null;
    } else {
    this.Longitude = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Elevation = null;
    } else {
    this.Elevation = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Wind_Direction = null;
    } else {
    this.Wind_Direction = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Quality_1 = null;
    } else {
    this.Quality_1 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Sky_Height = null;
    } else {
    this.Sky_Height = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Quality_2 = null;
    } else {
    this.Quality_2 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Visiblity_Distance = null;
    } else {
    this.Visiblity_Distance = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Quality_3 = null;
    } else {
    this.Quality_3 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Air_Temperature = null;
    } else {
    this.Air_Temperature = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Air_Quality = null;
    } else {
    this.Air_Quality = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Dew_Temperature = null;
    } else {
    this.Dew_Temperature = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Dew_Quality = null;
    } else {
    this.Dew_Quality = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Atmospheric_Pressure = null;
    } else {
    this.Atmospheric_Pressure = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Pressure_Quality = null;
    } else {
    this.Pressure_Quality = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Date.getTime());
    }
    if (null == this.USAF_Station) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.USAF_Station);
    }
    if (null == this.WBAN_Id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.WBAN_Id);
    }
    if (null == this.Time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Time);
    }
    if (null == this.Year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Year);
    }
    if (null == this.Latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Latitude);
    }
    if (null == this.Longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Longitude);
    }
    if (null == this.Elevation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Elevation);
    }
    if (null == this.Wind_Direction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Wind_Direction);
    }
    if (null == this.Quality_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Quality_1);
    }
    if (null == this.Sky_Height) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Sky_Height);
    }
    if (null == this.Quality_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Quality_2);
    }
    if (null == this.Visiblity_Distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Visiblity_Distance);
    }
    if (null == this.Quality_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Quality_3);
    }
    if (null == this.Air_Temperature) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Air_Temperature);
    }
    if (null == this.Air_Quality) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Air_Quality);
    }
    if (null == this.Dew_Temperature) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Dew_Temperature);
    }
    if (null == this.Dew_Quality) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Dew_Quality);
    }
    if (null == this.Atmospheric_Pressure) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Atmospheric_Pressure);
    }
    if (null == this.Pressure_Quality) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Pressure_Quality);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Date.getTime());
    }
    if (null == this.USAF_Station) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.USAF_Station);
    }
    if (null == this.WBAN_Id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.WBAN_Id);
    }
    if (null == this.Time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Time);
    }
    if (null == this.Year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Year);
    }
    if (null == this.Latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Latitude);
    }
    if (null == this.Longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Longitude);
    }
    if (null == this.Elevation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Elevation);
    }
    if (null == this.Wind_Direction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Wind_Direction);
    }
    if (null == this.Quality_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Quality_1);
    }
    if (null == this.Sky_Height) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Sky_Height);
    }
    if (null == this.Quality_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Quality_2);
    }
    if (null == this.Visiblity_Distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Visiblity_Distance);
    }
    if (null == this.Quality_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Quality_3);
    }
    if (null == this.Air_Temperature) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Air_Temperature);
    }
    if (null == this.Air_Quality) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Air_Quality);
    }
    if (null == this.Dew_Temperature) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Dew_Temperature);
    }
    if (null == this.Dew_Quality) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Dew_Quality);
    }
    if (null == this.Atmospheric_Pressure) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Atmospheric_Pressure);
    }
    if (null == this.Pressure_Quality) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Pressure_Quality);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(Date==null?"null":"" + Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USAF_Station==null?"null":"" + USAF_Station, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WBAN_Id==null?"null":"" + WBAN_Id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Time==null?"null":"" + Time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Year==null?"null":"" + Year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Latitude==null?"null":"" + Latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Longitude==null?"null":"" + Longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Elevation==null?"null":"" + Elevation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wind_Direction==null?"null":"" + Wind_Direction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Quality_1==null?"null":"" + Quality_1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Sky_Height==null?"null":"" + Sky_Height, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Quality_2==null?"null":"" + Quality_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Visiblity_Distance==null?"null":"" + Visiblity_Distance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Quality_3==null?"null":"" + Quality_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Air_Temperature==null?"null":"" + Air_Temperature, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Air_Quality==null?"null":"" + Air_Quality, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dew_Temperature==null?"null":"" + Dew_Temperature, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dew_Quality==null?"null":"" + Dew_Quality, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Atmospheric_Pressure==null?"null":"" + Atmospheric_Pressure, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pressure_Quality==null?"null":"" + Pressure_Quality, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(Date==null?"null":"" + Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USAF_Station==null?"null":"" + USAF_Station, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(WBAN_Id==null?"null":"" + WBAN_Id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Time==null?"null":"" + Time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Year==null?"null":"" + Year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Latitude==null?"null":"" + Latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Longitude==null?"null":"" + Longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Elevation==null?"null":"" + Elevation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Wind_Direction==null?"null":"" + Wind_Direction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Quality_1==null?"null":"" + Quality_1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Sky_Height==null?"null":"" + Sky_Height, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Quality_2==null?"null":"" + Quality_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Visiblity_Distance==null?"null":"" + Visiblity_Distance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Quality_3==null?"null":"" + Quality_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Air_Temperature==null?"null":"" + Air_Temperature, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Air_Quality==null?"null":"" + Air_Quality, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dew_Temperature==null?"null":"" + Dew_Temperature, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dew_Quality==null?"null":"" + Dew_Quality, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Atmospheric_Pressure==null?"null":"" + Atmospheric_Pressure, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pressure_Quality==null?"null":"" + Pressure_Quality, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Date = null; } else {
      this.Date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.USAF_Station = null; } else {
      this.USAF_Station = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WBAN_Id = null; } else {
      this.WBAN_Id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Time = null; } else {
      this.Time = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Year = null; } else {
      this.Year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Latitude = null; } else {
      this.Latitude = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Longitude = null; } else {
      this.Longitude = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Elevation = null; } else {
      this.Elevation = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Wind_Direction = null; } else {
      this.Wind_Direction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Quality_1 = null; } else {
      this.Quality_1 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Sky_Height = null; } else {
      this.Sky_Height = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Quality_2 = null; } else {
      this.Quality_2 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Visiblity_Distance = null; } else {
      this.Visiblity_Distance = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Quality_3 = null; } else {
      this.Quality_3 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Air_Temperature = null; } else {
      this.Air_Temperature = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Air_Quality = null; } else {
      this.Air_Quality = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Dew_Temperature = null; } else {
      this.Dew_Temperature = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Dew_Quality = null; } else {
      this.Dew_Quality = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Atmospheric_Pressure = null; } else {
      this.Atmospheric_Pressure = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Pressure_Quality = null; } else {
      this.Pressure_Quality = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Date = null; } else {
      this.Date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.USAF_Station = null; } else {
      this.USAF_Station = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.WBAN_Id = null; } else {
      this.WBAN_Id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Time = null; } else {
      this.Time = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Year = null; } else {
      this.Year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Latitude = null; } else {
      this.Latitude = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Longitude = null; } else {
      this.Longitude = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Elevation = null; } else {
      this.Elevation = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Wind_Direction = null; } else {
      this.Wind_Direction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Quality_1 = null; } else {
      this.Quality_1 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Sky_Height = null; } else {
      this.Sky_Height = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Quality_2 = null; } else {
      this.Quality_2 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Visiblity_Distance = null; } else {
      this.Visiblity_Distance = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Quality_3 = null; } else {
      this.Quality_3 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Air_Temperature = null; } else {
      this.Air_Temperature = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Air_Quality = null; } else {
      this.Air_Quality = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Dew_Temperature = null; } else {
      this.Dew_Temperature = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Dew_Quality = null; } else {
      this.Dew_Quality = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Atmospheric_Pressure = null; } else {
      this.Atmospheric_Pressure = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Pressure_Quality = null; } else {
      this.Pressure_Quality = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    Station o = (Station) super.clone();
    o.Date = (o.Date != null) ? (java.sql.Date) o.Date.clone() : null;
    return o;
  }

  public void clone0(Station o) throws CloneNotSupportedException {
    o.Date = (o.Date != null) ? (java.sql.Date) o.Date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("Date", this.Date);
    __sqoop$field_map.put("USAF_Station", this.USAF_Station);
    __sqoop$field_map.put("WBAN_Id", this.WBAN_Id);
    __sqoop$field_map.put("Time", this.Time);
    __sqoop$field_map.put("Year", this.Year);
    __sqoop$field_map.put("Latitude", this.Latitude);
    __sqoop$field_map.put("Longitude", this.Longitude);
    __sqoop$field_map.put("Elevation", this.Elevation);
    __sqoop$field_map.put("Wind_Direction", this.Wind_Direction);
    __sqoop$field_map.put("Quality_1", this.Quality_1);
    __sqoop$field_map.put("Sky_Height", this.Sky_Height);
    __sqoop$field_map.put("Quality_2", this.Quality_2);
    __sqoop$field_map.put("Visiblity_Distance", this.Visiblity_Distance);
    __sqoop$field_map.put("Quality_3", this.Quality_3);
    __sqoop$field_map.put("Air_Temperature", this.Air_Temperature);
    __sqoop$field_map.put("Air_Quality", this.Air_Quality);
    __sqoop$field_map.put("Dew_Temperature", this.Dew_Temperature);
    __sqoop$field_map.put("Dew_Quality", this.Dew_Quality);
    __sqoop$field_map.put("Atmospheric_Pressure", this.Atmospheric_Pressure);
    __sqoop$field_map.put("Pressure_Quality", this.Pressure_Quality);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("Date", this.Date);
    __sqoop$field_map.put("USAF_Station", this.USAF_Station);
    __sqoop$field_map.put("WBAN_Id", this.WBAN_Id);
    __sqoop$field_map.put("Time", this.Time);
    __sqoop$field_map.put("Year", this.Year);
    __sqoop$field_map.put("Latitude", this.Latitude);
    __sqoop$field_map.put("Longitude", this.Longitude);
    __sqoop$field_map.put("Elevation", this.Elevation);
    __sqoop$field_map.put("Wind_Direction", this.Wind_Direction);
    __sqoop$field_map.put("Quality_1", this.Quality_1);
    __sqoop$field_map.put("Sky_Height", this.Sky_Height);
    __sqoop$field_map.put("Quality_2", this.Quality_2);
    __sqoop$field_map.put("Visiblity_Distance", this.Visiblity_Distance);
    __sqoop$field_map.put("Quality_3", this.Quality_3);
    __sqoop$field_map.put("Air_Temperature", this.Air_Temperature);
    __sqoop$field_map.put("Air_Quality", this.Air_Quality);
    __sqoop$field_map.put("Dew_Temperature", this.Dew_Temperature);
    __sqoop$field_map.put("Dew_Quality", this.Dew_Quality);
    __sqoop$field_map.put("Atmospheric_Pressure", this.Atmospheric_Pressure);
    __sqoop$field_map.put("Pressure_Quality", this.Pressure_Quality);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
