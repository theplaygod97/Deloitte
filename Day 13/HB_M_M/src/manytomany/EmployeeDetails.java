package manytomany;

import java.util.Set;

public class EmployeeDetails {
		private int employeeId;
		private String employeeName;
		private int employeeSalary;
		
		private Set employeeAddress;
		
		public EmployeeDetails() {
		}
		
		

		public EmployeeDetails(int employeeId, String employeeName, int employeeSalary) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeSalary = employeeSalary;
		}



		public EmployeeDetails(int employeeId, String employeeName, int employeeSalary, Set employeeAddress) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeSalary = employeeSalary;
			this.employeeAddress = employeeAddress;
		}

		/**
		 * @return the employeeId
		 */
		public int getEmployeeId() {
			return employeeId;
		}

		/**
		 * @param employeeId the employeeId to set
		 */
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		/**
		 * @return the employeeName
		 */
		public String getEmployeeName() {
			return employeeName;
		}

		/**
		 * @param employeeName the employeeName to set
		 */
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		/**
		 * @return the employeeSalary
		 */
		public int getEmployeeSalary() {
			return employeeSalary;
		}

		/**
		 * @param employeeSalary the employeeSalary to set
		 */
		public void setEmployeeSalary(int employeeSalary) {
			this.employeeSalary = employeeSalary;
		}

		/**
		 * @return the employeeAddress
		 */
		public Set getEmployeeAddress() {
			return employeeAddress;
		}

		/**
		 * @param employeeAddress the employeeAddress to set
		 */
		public void setEmployeeAddress(Set employeeAddress) {
			this.employeeAddress = employeeAddress;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "EmployeeDetails [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
					+ employeeSalary + ", employeeAddress=" + employeeAddress + "]";
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((employeeAddress == null) ? 0 : employeeAddress.hashCode());
			result = prime * result + employeeId;
			result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
			result = prime * result + employeeSalary;
			return result;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			EmployeeDetails other = (EmployeeDetails) obj;
			if (employeeAddress == null) {
				if (other.employeeAddress != null)
					return false;
			} else if (!employeeAddress.equals(other.employeeAddress))
				return false;
			if (employeeId != other.employeeId)
				return false;
			if (employeeName == null) {
				if (other.employeeName != null)
					return false;
			} else if (!employeeName.equals(other.employeeName))
				return false;
			if (employeeSalary != other.employeeSalary)
				return false;
			return true;
		}
		
}
