@RestController
class MyJdbcController {
    
    @Autowired
    private MyJdbcService service
    
    @RequestMapping("/")
    List<TableBean> queryData(){
        System.out.println("Processing Request.")
        return service.getTableContent()
    }
}
