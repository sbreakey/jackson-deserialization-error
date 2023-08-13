package com.demoapp;

public class DTO {
   private String defaultedParam;
   private String normalParam;

   DTO(final String defaultedParam, final String normalParam) {
      this.defaultedParam = defaultedParam;
      this.normalParam = normalParam;
   }

   public String getDefaultedParam() {
      return this.defaultedParam;
   }

   public String getNormalParam() {
      return this.normalParam;
   }

   public void setDefaultedParam(final String defaultedParam) {
      this.defaultedParam = defaultedParam;
   }

   public void setNormalParam(final String normalParam) {
      this.normalParam = normalParam;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DTO)) {
         return false;
      } else {
         DTO other = (DTO)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$defaultedParam = this.getDefaultedParam();
            Object other$defaultedParam = other.getDefaultedParam();
            if (this$defaultedParam == null) {
               if (other$defaultedParam != null) {
                  return false;
               }
            } else if (!this$defaultedParam.equals(other$defaultedParam)) {
               return false;
            }

            Object this$normalParam = this.getNormalParam();
            Object other$normalParam = other.getNormalParam();
            if (this$normalParam == null) {
               if (other$normalParam != null) {
                  return false;
               }
            } else if (!this$normalParam.equals(other$normalParam)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof DTO;
   }

   public int hashCode() {
      int result = 1;
      Object $defaultedParam = this.getDefaultedParam();
      result = result * 59 + ($defaultedParam == null ? 43 : $defaultedParam.hashCode());
      Object $normalParam = this.getNormalParam();
      result = result * 59 + ($normalParam == null ? 43 : $normalParam.hashCode());
      return result;
   }

   public String toString() {
      String var10000 = this.getDefaultedParam();
      return "DTO(defaultedParam=" + var10000 + ", normalParam=" + this.getNormalParam() + ")";
   }
}
