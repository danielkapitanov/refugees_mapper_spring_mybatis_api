package mybatis.services.Refugees;

import mybatis.mappers.Refugees.RefugeesMapper;

import mybatis.model.Refugees.Refugee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by daniel on 24.07.17.
 */
@Service
public class RefugeesService {
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    @Autowired
    RefugeesMapper refugeesMapper;

    public ArrayList<Refugee> getAllData() {
        return refugeesMapper.getAllData();
    }

    public ArrayList<Refugee> getAllBGData() {
        return refugeesMapper.getAllBGData();
    }

    public ArrayList<Refugee> getByYear(int Year){
        return refugeesMapper.getByYear(Year);
    }

    public ArrayList<Refugee> getByCoR(String CountryOfResidense){
        return refugeesMapper.getByCoR(CountryOfResidense);
    }

    public Refugee custom(int year, String countryofresidense){
        return refugeesMapper.custom(year, countryofresidense);
    }
}
