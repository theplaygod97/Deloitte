package manytomany;

public class AddressDetails {
		private int addressId;
		private String cityName;
		private String stateName;

		public AddressDetails() {
			// TODO Auto-generated constructor stub
		}

		public AddressDetails(int addressId, String cityName, String stateName) {
			super();
			this.addressId = addressId;
			this.cityName = cityName;
			this.stateName = stateName;
		}

		/**
		 * @return the addressId
		 */
		public int getAddressId() {
			return addressId;
		}

		/**
		 * @param addressId the addressId to set
		 */
		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}

		/**
		 * @return the cityName
		 */
		public String getCityName() {
			return cityName;
		}

		/**
		 * @param cityName the cityName to set
		 */
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		/**
		 * @return the stateName
		 */
		public String getStateName() {
			return stateName;
		}

		/**
		 * @param stateName the stateName to set
		 */
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + addressId;
			result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
			result = prime * result + ((stateName == null) ? 0 : stateName.hashCode());
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
			AddressDetails other = (AddressDetails) obj;
			if (addressId != other.addressId)
				return false;
			if (cityName == null) {
				if (other.cityName != null)
					return false;
			} else if (!cityName.equals(other.cityName))
				return false;
			if (stateName == null) {
				if (other.stateName != null)
					return false;
			} else if (!stateName.equals(other.stateName))
				return false;
			return true;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "AddressDetails [addressId=" + addressId + ", cityName=" + cityName + ", stateName=" + stateName
					+ "]";
		}
		
		
}
