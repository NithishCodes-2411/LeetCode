/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        
        Employee emp = null;
        HashMap<Integer , Employee>  empData = new HashMap<>();
        for(Employee e : employees) {
            if(e.id==id) emp = e;
            empData.put(e.id , e);
        }
        System.out.print(emp.id);
        return findImp(emp , empData);

        
    }
    public int findImp(Employee e ,  HashMap<Integer , Employee>  empData   ){
          
        Employee emp = empData.get(e.id);
        int imp = 0;
        imp += emp.importance;
        for(Integer eId : emp.subordinates ){
            imp += findImp(empData.get(eId) , empData);
        } 
        return imp;
    }
}