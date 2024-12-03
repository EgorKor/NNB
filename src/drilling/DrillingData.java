package drilling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DrillingData {
    private double azimuth;               //азимут
    private double angle;                 //угол отклонителя
    private double vertical;              //вертикаль
    private double intensity;             //пространственная интенсивность
    private double pointOfMeasure;        //точка замера
    private double directionWellCurvature;//направление искривления скважины
}
