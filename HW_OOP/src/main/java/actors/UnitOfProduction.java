package actors;

public class UnitOfProduction {
        private int UnitIndex;
        private String UnitName;
        private String UnitType;
        private String ScopeOfUse;

        public UnitOfProduction (int index, String name, String type, String scope) {
            this.UnitIndex = index;
            this.UnitName = name;
            this.UnitType = type;
            this.ScopeOfUse = scope;
        }

        public int getUnitIndex () {
            return this.UnitIndex;
        }
        public String getUnitName () {
            return this.UnitName;
        }
        public String getUnitType () {
            return this.UnitType;
        }
        public String getScopeOfUse () {
            return this.ScopeOfUse;
        }
        public void setUnitIndex (int index) {
            this.UnitIndex = index;
        }
        public void setUnitName (String UnitName) {
            this.UnitName = UnitName;
        }
        public void setUnitType (String UnitType) {
            this.UnitType = UnitType;
        }
        public void setScopeOfUse (String ScopeOfUse) {
            this.ScopeOfUse = ScopeOfUse;
        }
        public void printInfoAboutUnit () {
            System.out.println("Information about unit of production : ");
            System.out.println("Unit index : " + this.UnitIndex);
            System.out.println("Unit name : " + this.UnitName);
            System.out.println("Unit type : " + this.UnitType);
            System.out.println("Unit scope of use : " + this.ScopeOfUse);
        }
    }
