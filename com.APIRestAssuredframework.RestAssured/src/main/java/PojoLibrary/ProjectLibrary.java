package PojoLibrary;



public class ProjectLibrary {
	
	
//	 1. Declare the required key variables globally
		
		
		String createdBy;
		String projectName;
		String status;
		int teamSize;
		
		// 2. Create a constructor to initialise these variables

		
		public ProjectLibrary(String createdBy, String projectName, String status, int teamSize) {
			this.createdBy = createdBy;
			this.projectName = projectName;
			this.status = status;
			this.teamSize = teamSize;
		}

		public String getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public String getProjectName() {
			return projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public int getTeamSize() {
			return teamSize;
		}

		public void setTeamSize(int teamSize) {
			this.teamSize = teamSize;
		}
		
		
		
//3. Provide getters and setters to access these variables

		
		

}