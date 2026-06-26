class Program51{
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            
                if(i==1){
                    for(char ch = 'E';ch>='A';ch--){
                        System.out.print(ch + " ");
                    }
                }
                if(i==2){
                    for(char ch = 'A';ch<='D';ch++){
                        System.out.print(ch + " ");
                    }
                }
                if(i==3){
                    for(char ch='D';ch>='B';ch--){
                        System.out.print(ch + " ");
                    }
                }
                if(i==4){
                    for(char ch='B';ch>='A';ch--){
                        System.out.print(ch + " ");
                    }
                }
                if(i==5){
                    System.out.print('A' + " ");
                }
                 System.out.println();
            }
           
        }
    }
