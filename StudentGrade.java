 public static List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> finalGrade=new ArrayList<>();
      for(int i=0;i<grades.size();i++){
          int grade=grades.get(i);
          int modulo=grade%5;
          if(grade<38) finalGrade.add(grade);
          else if((5-modulo)>=3) finalGrade.add(grade);
          else finalGrade.add(grade+(5-(modulo)));
      }
        return finalGrade;

    }
