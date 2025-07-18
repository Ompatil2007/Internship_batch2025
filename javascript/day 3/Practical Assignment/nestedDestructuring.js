const users = [
    {
    userid : 1,
    user_name: "Om",
    gender : "male"},
    {
    userid : 2,
    user_name: "Sai",
    gender : "male"},
    {
    userid : 3,
    user_name: "Mayur",
    gender : "female"},
    {
    userid : 3,
    user_name: "Ritesh",
    gender : "female"},
    

]

const[,{gender:user3_gender},{user_name : user1_username,userid}] = users;
console.log(user1_username);
console.log(user3_gender);
console.log(userid);