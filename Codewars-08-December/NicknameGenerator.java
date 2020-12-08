class Generator {
        public static String nickname (String name) {
          
        if (name.length() < 4 ){
            return "Error: Name too short";
        }
        
        if ("aeiou".indexOf(name.charAt(2)) != -1) {
          name = name.substring(0, 4);
            return name;
        } else {return name.substring(0, 3);}
    }
}