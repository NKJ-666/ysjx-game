package backgroud;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Map {
    //暂存地图数据
    private List<String> mapData;

    //最终地图数据
    private int [][] map;
    /**
     * 读取地图文件
     * @param path 文件路径
     * @return 数组
     */
    public int [][] readMap(String path) throws IOException {
        mapData = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(path);
        InputStreamReader isReader = new InputStreamReader(fileInputStream);
        BufferedReader bReader = new BufferedReader(isReader);
        String value = bReader.readLine();
        while(value != null){
            mapData.add(value);
            value = bReader.readLine();
        }
        bReader.close();
        int row = mapData.size();
        int line = mapData.get(0).split(",").length;
        map = new int[row][line];
        for(int i = 0; i < row; i++){
            String [] rowData = mapData.get(i).split(",");
            for(int j = 0; j < line; j++){
                map[i][j] = Integer.parseInt(rowData[j]);
            }
        }
        return map;
    }
}
