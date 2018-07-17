import java.util.Arrays

import java.sql.ResultSet

@Service
class MyJdbcService {
    
    @Autowired
    private JdbcTemplate template
    
    public List<TableBean> getTableContent(){
        String query = "SELECT ID, NAME, CITY FROM BANKS"
        return template.query(query, new Object[0], new int[0], new RowMapper<TableBean>(){
            
            @Override
            TableBean mapRow(ResultSet rs, int rowNum){
                TableBean bean = new TableBean()
                bean.setId(rs.getInt("ID"))
                bean.setName(rs.getString("NAME"))
                bean.setCity(rs.getString("CITY"))
                return bean
            }
        })
        
    }
}
