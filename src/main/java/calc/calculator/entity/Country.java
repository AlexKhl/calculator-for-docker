package calc.calculator.entity;



import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "country")
public class Country implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column
    private int code;

    @Column
    private String alpha2;

    @Column
    private String alpha3;

    @Column
    private String name;

    @Column
    private String shortName;

    public Country() {

    }

    public Country(int code, String alpha2, String alpha3, String name, String shortName) {
        this.code = code;
        this.alpha2 = alpha2;
        this.alpha3 = alpha3;
        this.name = name;
        this.shortName = shortName;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setAlpha2(String alpha2) {
        this.alpha2 = alpha2;
    }

    public void setAlpha3(String alpha3) {
        this.alpha3 = alpha3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getCode() {
        return code;
    }

    public String getAlpha2(){
        return alpha2;
    }

    public String getAlpha3(){
        return alpha3;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }
}
