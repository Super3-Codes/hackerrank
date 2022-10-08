 public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List<Integer> final_grade = new LinkedList<>();
    for(Integer grade:grades){
        if(grade < 38){
            final_grade.add(grade);
        }else if(grade % 5 == 0){
            final_grade.add(grade);
        }else if((grade + 1)% 5 == 0){
            final_grade.add(grade+1);
        }else if((grade + 2) % 5 == 0){
            final_grade.add(grade+2);
        }else{
            final_grade.add(grade);
        }
    }
    return final_grade;

    }
