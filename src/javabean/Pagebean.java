package javabean;

import java.io.Serializable;
import java.util.List;

public class Pagebean<E> implements Serializable {
        private List<E> list;//当前页的数据
        private int currpage;//当前页数
        private int pagesize;//每页所包含的宠物个数
        private int totalpage;//总页数
        private int totalcount;//总商品数
		
        public Pagebean() {	}

		public Pagebean(List<E> list, int currpage, int pagesize, int totalpage, int totalcount) {
			super();
			this.list = list;
			this.currpage = currpage;
			this.pagesize = pagesize;
			this.totalpage = totalpage;
			this.totalcount = totalcount;
		}

		public List<E> getList() {
			return list;
		}

		public void setList(List<E> list) {
			this.list = list;
		}

		public int getCurrpage() {
			return currpage;
		}

		public void setCurrpage(int currpage) {
			this.currpage = currpage;
		}

		public int getPagesize() {
			return pagesize;
		}

		public void setPagesize(int pagesize) {
			this.pagesize = pagesize;
		}

		public int getTotalpage() {
			return totalpage;
		}

		public void setTotalpage(int totalpage) {
			this.totalpage = totalpage;
		}

		public int getTotalcount() {
			return totalcount;
		}

		public void setTotalcount(int totalcount) {
			this.totalcount = totalcount;
		}
        
        
        
        
}
