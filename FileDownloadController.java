@RequestMapping(value = "/collectionFileDownload")
	public  void fileDownload(
			  @RequestParam(value ="document_nm", required = false) String document_nm
			, HttpSession session
			, HttpServletRequest req
			, HttpServletResponse res
			, ModelAndView mav) throws Throwable 
		{
		try {
			KofaCollectionDownloadFile fileDown = new KofaCollectionDownloadFile(); //파일다운로드 객체생성
			// local file download path => /home/kfupload/www/exhibitionManage/
			//fileDown.filDown(req, res, "파일경로입력" + "/" , "파일이름이력", "다운받았을때출력되는파일이름입력"); //파일다운로드 
			fileDown.filDown(req, res, "/home/kfupload/www/exhibitionManage/" , "3e953a72-e221-40f3-a175-871d1857bc30.PNG", "3e953a72-e221-40f3-a175-871d1857bc30.PNG"); //파일다운로드 

			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}