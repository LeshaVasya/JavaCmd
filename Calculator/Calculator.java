/**
	Calculator Class
    @author LeshaVasya
    @since 03.02.2016
*/
public class Calculator{
	/**
		The final result
	*/
	private int result;
    /**
        Constructor
    */
    public void Calculator(){
        result = 0;
    }
    /**
        Adddiction method
        @param  Arguments
    */
    public void (int ... params){
        for (Integer param: params){
            this.result += param;
        }
    }
    /**
        Getting Result
        @result The final result
    */
    public int getResult(){
        return this.result;
    }
    /**
        Clean result
    */
    public void cleanResult(){
        this.result = 0;
    }
}

