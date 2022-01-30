export default function data() {
  return {
    columns: [
      { Header: "사용자 이름", accessor: "userName", width: "30%", align: "left" },
      { Header: "사용자 ID", accessor: "userId", width: "30%", align: "left" },
      { Header: "비밀번호", accessor: "userPw", width: "40%", align: "center" },
    ],
  };
}
