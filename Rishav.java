package com.amit;

public class Rishav {
	private String rshv;

    public Rishav(String rshv) {
        this.rshv = rshv;
    }

    /**
    * @return the rshv
    */
    public String getRshv() {
        return rshv;
    }

    /**
    * @param rshv the rshv to set
    */
    public void setRshv(String rshv) {
        this.rshv = rshv;
    }

    @Override
    public boolean equals(Object obj) {
    	System.out.println("inside equals");
        if (obj instanceof Rishav) {
            obj = (Rishav) obj;
            if (this.rshv.equals(((Rishav) obj).getRshv())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

	/*
	 * @Override public int hashCode() { return rshv.hashCode(); }
	 */

}
