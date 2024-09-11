package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Campaign;
import dto.Category;
import service.CampaignService;
import service.CampaignServiceImpl;

/**
 * Servlet implementation class CampaignDetail
 */
@WebServlet("/campaignDetail")
public class CampaignDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CampaignDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Integer campaignNum = Integer.parseInt(request.getParameter("campaignNum"));

		try {
			
			CampaignService service = new CampaignServiceImpl();
			List<Category> categoryList;
			
			categoryList = service.categoryList();
			Campaign campaign = service.detail(campaignNum);
			
			request.setAttribute("categoryList", categoryList);
			request.setAttribute("campaign", campaign);
			request.getRequestDispatcher("campaign/campaign_detail.jsp").forward(request, response);
			
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("err", e.getMessage());
			request.getRequestDispatcher("err.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
